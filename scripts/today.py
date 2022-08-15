#!/usr/bin/env python
import requests
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

print("""
    日期: {}
    题目: {}. {}
    难度: {}
    通过率: {}
""".format(date, id, title, difficulty, round(ac_rate * 100, 2)))

