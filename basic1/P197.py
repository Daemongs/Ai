data = list(range(1,21))

for i in range( 0, len(data), 1) :
    print("%d" %data[i] , end=" ")
print("----")

for i in range( 1, len(data), 2) :
    print("%d" %data[i] , end=" ")
print("----")

for i in range( 0, len(data), 2) :
    print("%d" %data[i] , end=" ")

    
date = []
for x in range (10, 21) :
    data.append(x)
    print(data)