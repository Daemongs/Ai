#변수연습
_name = "홍길동"
_Name = "다른변수"
_name = "이순신"
print(_name)
print(type(_name)) #type함수는 자료형을 보여준다
number=10
print(type(number))
pi = 3.14
ok = True
print(type(pi))
print(type(ok))
number="백점"
print(number)
print(type(number))
#사칙연산
str1="abc"
str2="def"
print(str1+str2)
print(str1*5)

number=1; number2=2; number3=3;
number4 = number+number2
number5 = number2*number3
number6 = number2 **number3
number7 = number3 / number2
number8 = number3 % number2
print( number, number2, number3, sep="--")
print( number4, number5, number6, sep="==")
print( number7, number8, sep="-->")

ok1 = True
ok2 = False
ok3 = ok1+ok2
ok4 = ok1-ok2
ok5 = ok1*ok2
# ok6 = ok1/ok2
# print(ok3, ok4, ok5, ok6, sep=">>")

print(-26.35+8.7*(-21.0))
print(3/5)
a=1/3
print(a)
print("%.1f"%a)
b=100//35

s="안녕하세요. 반갑습니다"
print(s[3:5]) #3 <= index number < 5
print(s[:6]) #0 <= index number < 6
print(s[7:]) #7 <= index number < 끝까지
print(s[:]) #0 <= index number < 끝까지

jumin = "061225-4029583"
# 성별추출하기 4
sex = jumin[7:8]
# 생일 추출하기 2006.12.25.
year = jumin[0:2]
month = jumin[2:4]
day = jumin[4:6]
print("20",year,"년",month,"월",day,"일", sep="" )
print(len(jumin))

a=100
#print(len(a))

print("-"*100)

a=100
b="abc"
c=(str)(a)+b #"100"+"abc"
print(type(c))
print(c) #100abc

a="100"
b="200"

c=(int)(a)+(int)(b)
# https://www.youtube.com/watch?v=T6z-0dpXPvU