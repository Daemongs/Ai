#함수
#용도는?  역할을 담당하는 것
#사용법은? 만들기 > 호출해서 사용
def hello() : #사용자 정의 함수 만들기
    print("Hi!") #내장 함수

def goodMorning():
    print("Good Morning")
goodMorning()    
hello() #호출

#함수의 종류
#내장함수 : 파이썬에서 미리 만들어 둔것
#사용자 정의함수 : 프로그래머가 만들어 주는 함수
def hi (name) :
    print(f"안녕!   {name}야")

hi("길동") #매개변수에 들어갈 값 : 실인수 Arguments

#나는 누구야 키가 180이야

def height(name, height) :
    print(f"나는 {name}이요, 키는{height}이다")
height( "가가", 150)
height( "나나", 120)

#여러개 매개변수인 경우(가변인 경우)
def average(*args) :
    num_args = len(args) #실인수의 갯수가 나온다
    sum = 0
    for i in range(num_args) :
        sum = sum+args[i]
    avg = sum / num_args
    print(f"평균은 {avg}")



average(85,96,87)
average(85,96,87,97,72)


#함수만들기

def printAll(*str1) :
    #갯수를 구하세요
    s= ""#빈공백
    for i in str1 :
        s = s+i
    print(s)

printAll ("a", "b")
printAll ("a", "b","c")
printAll ("a", "b","c","d")

#265PAGE
def func(food) : #fruits 리스트의 힙메모리의 주소가 전달
    for x in food :
        print(x)
        
fruits = [] #리스트 : 수정이 된다. 중복도 가능
fruits = ["사과","오렌지","바나나","사과"] 
func(fruits)
#튜플 : 리스트와 동일. 그러나 수정이 안됨. 변경하면 안되는 것만 저장

def tD(tDP):
    for i in tDP:
        print(i)

tupleData = ("삼성", "LG","세스코")
tD(tupleData)


def dicF(dicData):
    dicData[4]='d'
    print(dicData)

dicData={1:"a", 2:"b", 3:"c"}
dicF(dicData)

def returnSum(n1, n2, n3):
    s=n1+n2+n3
    return s

ss = returnSum(10,20,30)
print(ss)


#반지름 10, 원 넓이 구하는 함수 만들기
def returnArea(r):
    return r*r*3.14

circleArea = returnArea(10)
print(circleArea)