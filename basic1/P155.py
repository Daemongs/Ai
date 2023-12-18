print("-"*40)
print("     cm      mm      m       inch")
print("-"*40)

for cm in range(1, 101):
    mm = cm*10.0
    m = cm *0.01
    inch = cm*0.3937
    print("{:8.2f} {:8.2f} {:8.2f} {:8.2f}".format(cm, mm, m, inch))

print("-"*40)

for i in range(1,11):
    print (i*("*"), end="")
    print ()

for i in range(10, 0, -1):
    print (i*"*", end="")
    print ()

    #158
# number = input("숫자를 입력하세요: ")

# total = 0
# for a in number: 
#     a = int(a) 
#     if a%2 != 0:
#         total += 1

# print("홀수의 개수 : %개" % total)

#4-7
for i in range(1,6) :
    for j in range(1,11) :
        print ("*", end=" ")
    print()


#4-8
    
for i in range (9, 0, -1) :
    for j in range(0, i, 1):
        print (i, end=" ")
    print()
