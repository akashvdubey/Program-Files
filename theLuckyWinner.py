y=int(input("enter the no of different items"))
x=list()
for i in range(y):
    x.append(int(input("enter the element of the price array")))
temp=0
k=int(input("enter the lucky difference"))
WinnerCount=0
l=x.copy()
for i in x:
    for j in l:
        temp=abs(int(i)-int(j))
        print(temp)
        if temp==k:
            WinnerCount+=1
            print("the winner count till now is {}".format(WinnerCount))
    l=l[1:]
    print(k)
print("the total winners are{}".format(WinnerCount))
