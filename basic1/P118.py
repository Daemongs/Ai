char = input("영문 대문자 또는 소문자 하나를 입력하세요 : ")
char2 =char.upper()

if char2=="A" or char2=="E" or char2=="I" or char2=="O" or char2=="U" :
    print("%s -> 모음" %char)
else :
    print("%s -> 자음" %char)


height = int(input("키는?"))
weight = int(input("몸무게는?"))
s = (height-100)*0.9


print("------------------"*5)
print("+"*50)
print("키: ",height)
print("몸무게: ", weight)

if weight>=s :
    print("건강을 위해 다이어트가 필요합니다!!!!")
else :
    print("표준 또는 마른 체형입니다!!")


