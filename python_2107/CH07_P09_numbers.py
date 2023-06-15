
import clear
import time,os,clrprint
def count(seconds):
    if(seconds==-1):
        return
    os.system('clear')
    minutes = int(seconds/60)
    sec = int(seconds%60)
    cls = "red"
    if seconds<=10:
        cls = "yellow"
    clrprint.clrprint(minutes,":",sec,clr=cls)
    time.sleep(1)
    count(seconds-1)

count(13)