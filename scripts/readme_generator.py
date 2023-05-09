# -*- coding: UTF-8 -*-
import os
from urllib.parse import quote

def walk(path, kw, func):

    g = os.walk(path)
    result = []
    for path, dir_list, file_list in g:
        for dir_name in dir_list:
            if not '.' in dir_name:
                continue
            dir = os.path.join(path, dir_name)
            if kw in dir:
                result.append(dir)

    result.sort(key=func)
    return list(map(lambda x: x.replace("\\", "/"), result))

normal_result = walk("./算法", "00", lambda x: x)
db_result = walk("./数据库", "", lambda x: x)
normal_result += db_result
normal_result.sort(key = lambda x: int(x.split("/")[-1].split(".")[0]))

offer_result = walk("./算法/剑指Offer", "剑指", lambda x: x)
interview_result = walk("./算法/面试题", "面试题", lambda x: x)
lcp_result = walk("./算法/LCP", "LCP", lambda x: x)

all_result = normal_result + offer_result + interview_result + lcp_result

md_content = """
序号 | 题目
-|-
"""

for i in all_result:
  name = i.split("/")[-1]
  seq = name.split(".")[0]
  if os.path.exists(i + "/README.md"):
    md_content += "{} | [{}](https://github.com/0xcaffebabe/leetcode/tree/main{})".format(seq, name, quote(i[1:])) + "\n"
  else:
    for path, dir_list, file_list in os.walk(i):
      file_list.sort()
      md_content += "{} | [{}](https://github.com/0xcaffebabe/leetcode/tree/main{})".format(seq, name, quote(i[1:] + "/" + file_list[0])) + "\n"

f = open('./scripts/template.md', 'r', encoding="utf8")
template = f.read()
f.close()

f = open('README.md', 'w', encoding="utf8")
f.write(template.replace("{{solutions}}", md_content))
f.close()

print("done")