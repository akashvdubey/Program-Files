import turtle
import time
sk=turtle.Turtle()
turtle.tracer(0)
angle=0
height=400
width=12
sk.penup()
sk.color("brown")
sk.width(15)
sk.goto(0,-400)
sk.pendown()
position=sk.position()
sk.shape("arrow")

heading=sk.heading()
print(position)
def rt(sk,height,angle,position,heading,width):
    turtle.update()
    height=height*.65
    if height<1:
        return
    sk.penup()
    if width>1:
        width-=1
    sk.setposition(position[0],position[1])
    sk.setheading(heading)
    sk.pendown()
    sk._rotate(angle)
    sk.forward(height)
    position=sk.position()
    heading=sk.heading()
    #dk=sk.clone()
    sk.color("green")
    sk.width(width)
    rt(sk,height,60,position,heading,width)
    #dk1=sk.clone()
    sk.color("red")
    sk.width(width)
    rt(sk,height,300,position,heading,width)
rt(sk,height,90,position,heading,width)
turtle.update()
turtle.done()
