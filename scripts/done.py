#!/usr/bin/env python
# -*- coding: UTF-8 -*-
import os
from shlex import join
import sys
import shutil
import platform

def post_cmd():
    os.system("python3 scripts/readme_generator.py")
    os.system("python scripts/readme_generator.py")
    os.system('git add . ')
    os.system('git commit -a -m "➕{}"'.format(kw))
    os.system("git push")

file_list = os.listdir("./")
kw = sys.argv[1]
file_list = list(filter(lambda x: kw in x, file_list))

if len(file_list) == 0:
  print("no file!!")
  post_cmd()
  exit(-1)

base_dir = ""
for i in file_list:
  seq = i.split(".")[0]
  if ".sql" in i:
    base_dir = "./数据库/"
  elif "Offer" in seq:
    base_dir = "./算法/剑指Offer"
  elif "面试题" in seq:
    base_dir = "./算法/面试题"
  elif "LCP" in seq:
    base_dir = "./算法/LCP"
  elif "LCR" in seq:
    base_dir = "./算法/LCR"
  else:
    if seq.isnumeric():
      seq = int(seq)
      dir_range = ""
      if seq >= 1 and seq <= 500:
        dir_range = "001-500"
      elif seq >= 501 and seq <= 1000:
        dir_range = "501-1000"
      elif seq >= 1001 and seq <= 1500:
        dir_range = "1001-1500"
      elif seq >= 1501 and seq <= 2000:
        dir_range = "1501-2000"
      elif seq >= 2001 and seq <= 2500:
        dir_range = "2001-2500"
      elif seq >= 2501 and seq <= 3000:
        dir_range = "2501-3000"
      base_dir = "./算法/" + dir_range
    else:
      base_dir = base_dir + '/' + seq
  
  solutin_dir = i[0: i.rindex(".")]
  move_dir = base_dir + "/" + solutin_dir
  if not os.path.exists(move_dir):
    os.mkdir(move_dir)
  shutil.move(i, move_dir + "/" + i)
  print(i + " done")

post_cmd()