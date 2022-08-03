#!/usr/bin/env python
import os
from shlex import join
import sys
import shutil

def post_cmd():
  os.system("python scripts/readme_generator.py")
  os.system('git add . ')
  os.system('git commit -a -m "➕{}"'.format(kw))
  os.system("git push")

file_list = os.listdir("./")
kw = sys.argv[1]
file_list = list(filter(lambda x: kw in x, file_list))

if len(file_list) == 0:
  print("no file!!")
  exit(-1)

base_dir = ""
for i in file_list:
  seq = i.split(".")[0]
  if ".sql" in i:
    base_dir = "./数据库/"
  elif "剑指Offer" in seq:
    base_dir = "./算法/剑指Offer"
  elif "面试题" in seq:
    base_dir = "./算法/面试题"
  elif "LCP" in seq:
    base_dir = "./算法/LCP"
  else:
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
    base_dir = "./算法/" + dir_range
  
  solutin_dir = i[0: i.rindex(".")]
  move_dir = base_dir + "/" + solutin_dir
  if not os.path.exists(move_dir):
    os.mkdir(move_dir)
  shutil.move(i, move_dir + "/" + i)
  print(i + " done")

post_cmd()