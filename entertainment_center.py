import media
import fresh_tomatoes

apollo_13 = media.Movie("Apollo 13", 
	"The astronauts on the Apollo 13 mission to the moon .", 
	"https://upload.wikimedia.org/wikipedia/en/9/9e/Apollo_thirteen_movie.jpg", 
	"https://www.youtube.com/watch?v=nEl0NsYn1fU", 
   "http://www.imdb.com/title/tt0112384/",
   "https://en.wikipedia.org/wiki/Apollo_13_(film)")

contact = media.Movie("Contact",
	"Scientists detect a signal from a distant planet.",
	"https://upload.wikimedia.org/wikipedia/en/7/75/Contact_ver2.jpg",
	"https://www.youtube.com/watch?v=SRoj3jK37Vc",
   "http://www.imdb.com/title/tt0118884/",
   "https://en.wikipedia.org/wiki/Contact_(1997_American_film)")

gravity = media.Movie("Gravity", 
	"A hacker uncovers a secret about reality that changes everything.", 
    "https://upload.wikimedia.org/wikipedia/en/f/f6/Gravity_Poster.jpg",
    "http://www.youtube.com/watch?v=OiTiKOy59o4",
    "http://www.imdb.com/title/tt1454468",
    "https://en.wikipedia.org/wiki/Gravity_(film)")

interstellar = media.Movie("Interstellar", 
	"A crew of astronauts search for humanity\'s new home.",
	 "https://upload.wikimedia.org/wikipedia/en/b/bc/Interstellar_film_poster.jpg", 
	 "https://www.youtube.com/watch?v=3WzHXI5HizQ",
    "http://www.imdb.com/title/tt0816692/",
    "https://en.wikipedia.org/wiki/Interstellar_(film)")

the_martian = media.Movie("The Martian",
 "An astronaut is stranded on Mars and must fight to survive.",
 "https://upload.wikimedia.org/wikipedia/en/c/cd/The_Martian_film_poster.jpg",
 "https://www.youtube.com/watch?v=ej3ioOneTy8",
 "http://www.imdb.com/title/tt3659388/",
 "https://en.wikipedia.org/wiki/The_Martian_(film)")

two_thousand_one = media.Movie("2001: A Space Odyssey", 
	"A voyage to Jupiter has many surprises in store.", 
	"https://upload.wikimedia.org/wikipedia/en/e/ef/2001_A_Space_Odyssey_Style_B.jpg", 
	"https://www.youtube.com/watch?v=lfF0vxKZRhc",
   "http://www.imdb.com/title/tt0062622",
   "https://en.wikipedia.org/wiki/2001:_A_Space_Odyssey")

movies = [apollo_13, contact, the_matrix, interstellar, the_martian, two_thousand_one]

#fresh_tomatoes.open_movies_page(movies)

print(media.Movie.__module__)