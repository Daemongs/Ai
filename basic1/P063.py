#문자열 반복 연산자
x="토끼"*10
print(x)
x = "말 한마디로 천냥 빚을 갚는다."
print(len(x))

x="-"*10
y="거북이"
print(len(x+y))

x="apple"+str(123)
y="-"*10+"="*20
print(len(x+y))
print(x)

animal = "고양이"
age = 25
sex = False
score=12.55
x = "나는 %s를 좋아하는 %d살 포인트 점수 %.1f입니다"%(animal,age,score)
print (x)

y="a"
x="%c"%y #%c는 한글자 한글자 이상
print(x)

#키보드 입력 Scanner sc=new Scanner(System.in); sc.nextInt();
#input()
"""name = input("이름을 입력하세요")
print ( "%s입니다"%name)"""

"""score = input("점수는")
print (type(score))
print ( "%d 입니다"% (int)(score))"""

"""score = (int) (input("점수는"))
print (type(score))
print ( "%d 점입니다"% score)

#실수 반지름 12.5765를 입력받아서 원넓이(반지름*반지름*3.14)를 구하기
radius = (float)(input("반지름은?"))
area = radius *radius *3.14
print ("%.3f 원넓이" %area)"""

name = "홍지영"
a=10
b=20
print(name, a,b,a-b,100, sep="")

#76 널이란? 값이 없는 것"" / " "은 공백 / 0은 숫자

print("문자열에는 문자 앞 뒤에 쌍따옴표(\")를 \n붙인다")
