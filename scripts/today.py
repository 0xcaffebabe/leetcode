#!/usr/bin/env python
import os
import requests

def has_done(id):
  g = os.walk("./")
  result = []
  for path, dir_list, file_list in g:
      for dir_name in dir_list:
          if not '.' in dir_name:
              continue
          dir = os.path.join(path, dir_name)
          if'00' in dir:
              result.append(dir)
  solutions = list(map(lambda x: x.replace("\\", "/"), result))
  for item in solutions:
    if item.split("/")[-1].split(".")[0] == id:
      return item
  return None

session = requests.session()
req_body = {"query":"\n    query questionOfToday {\n  todayRecord {\n    date\n    userStatus\n    question {\n      questionId\n      frontendQuestionId: questionFrontendId\n      difficulty\n      title\n      titleCn: translatedTitle\n      titleSlug\n      paidOnly: isPaidOnly\n      freqBar\n      isFavor\n      acRate\n      status\n      solutionNum\n      hasVideoSolution\n      topicTags {\n        name\n        nameTranslated: translatedName\n        id\n      }\n      extra {\n        topCompanyTags {\n          imgUrl\n          slug\n          numSubscribed\n        }\n      }\n    }\n    lastSubmission {\n      id\n    }\n  }\n}\n    ","variables":{}}

headers = {
  'Content-Type': 'application/json'
}
resp = requests.post("https://leetcode.cn/graphql/", headers=headers, json=req_body)
data = resp.json()['data']['todayRecord'][0]

date = data['date']
id = data['question']['frontendQuestionId']
difficulty = data['question']['difficulty']
title = data['question']['titleCn']
ac_rate = data['question']['acRate']
done_location = has_done(id)

print("""
    日期: {}
    题目: {}. {}
    难度: {}
    通过率: {}
    做过: {} ({})
""".format(date, id, title, difficulty, round(ac_rate * 100, 2), done_location is not None, done_location))

