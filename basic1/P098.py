# P098
# x = int(input("정수를 입력하세요 : "))
# if x > 0 :
#     print ("양수") #10>0 참 and 그리고 
#     print (f"{x}") # or ~이거나
#     # not 반대 참이면 거짓

xx = 10
print ( xx%2 ==0 or xx%3 ==0) #T or F

#P105 1
a = 5
b = 7
c = a+b
c == 12
print (c ==12 )

#P105 2
hobby1 = "영화감상"
hobby2 = "수영"
my_hobby = "독서"
print(my_hobby == hobby1 or my_hobby ==hobby2)

# #P105 3
# pilgi = 90
# silgi = 70
# print(pilgi >=80 and silgi >= 80)
# if print("합격")
# else : 
#     print("불합격")
# 월 입력을 받아서
month = int(input("월?"))
if month <=0 or month > 13:
    print("잘못된 달입니다") 
elif 1<=month <= 3:
    print("1사분기")
elif 4<=month <= 6:
    print("2사분기")
elif 7<=month <= 9:
    print("3사분기")
elif 10<=month <= 12:
    print("4사분기")
else :
    print("잘못된 달입니다")
    

