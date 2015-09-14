import webbrowser
import time

breaks = 3;

print("Break time started on "+time.ctime())

while breaks:
    time.sleep(60*25)
    webbrowser.open("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
    time.sleep(60*5)
    breaks -=1
