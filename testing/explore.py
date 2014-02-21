#! /usr/bin/env python

import string
import random

allchars = list("abcdefg" + '$#@!')
for each in allchars:
  value = each + random.choice(allchars)
  print """- mvn -Dskip.surefire.tests=true -Dit.test=MailMergeExplore -Dvalue=%s verify:\n    path: simple-parent/simple-command""" % value


