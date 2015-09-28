import urllib

def read_text():
	quotes = open("/Users/Gineton2/CODE/udacity/FullStack/Foundations/movie_quotes.txt")
	file_contents = quotes.read()
	print(file_contents)
	quotes.close()
	check_profanity(file_contents)

def check_profanity(text_to_check):
	connection = urllib.urlopen("http://www.wdyl.com/profanity?q="+text_to_check)
	output = connection.read()
	connection.close()
	if "true" in output:
		print("Profanity Alert!")
	elif "false" in output:
		print("This document has no curse words.")
	else:
		print("There was a problem reading the document.")

read_text()