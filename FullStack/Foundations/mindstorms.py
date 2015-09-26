import turtle

zelda = turtle.Turtle()
zelda.tracer(0)
zelda.color("yellow")
zelda.speed(0)


def draw_triforce_fractal():
	draw_tritriforce()
	zelda.forward(4*22.5)
	draw_tritriforce()
	zelda.forward(22.5)
	zelda.left(120)
	zelda.forward(7*22.5)
	draw_tritriforce()

def draw_tritriforce():
	for tritriforce in xrange(3):
		for triforce in xrange(4):
			zelda.fill(True)
			for pieces in xrange(4):
				zelda.forward(22.5)
				zelda.left(120)
			zelda.fill(False)
			zelda.forward(22.5)
		zelda.forward(2*22.5)


def draw_square():
	brad = turtle.Turtle()
	brad.shape("turtle")
	brad.color("green")
	brad.speed(7)

	for turns in xrange(4):
		brad.forward(100)
		brad.right(90)

def draw_squared_circle():
	brad = turtle.Turtle()
	brad.shape("turtle")
	brad.color("green")
	brad.speed(0)
	for turns in xrange(500):
		for angles in xrange(4):
			brad.forward(100)
			brad.right(90)
		brad.right(5)


def draw_circle():
	angie = turtle.Turtle()
	angie.shape("arrow")
	angie.color("red")
	angie.left(50)
	angie.speed(7)
	angie.circle(75)

def draw_triangle():
	danny = turtle.Turtle()
	danny.shape("circle")
	danny.speed(7)
	danny.color("yellow")

	for turns in xrange(3):
		danny.forward(100)
		danny.left(120)

def draw_shapes():
	window = turtle.Screen()
	window.bgcolor("black")
	# draw_square()
	# draw_circle()
	# draw_triangle()
	# draw_squared_circle()
	draw_triforce_fractal()
	window.exitonclick()
draw_shapes()




