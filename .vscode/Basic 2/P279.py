#지역변수
#전역변수
def func():
    x = 10
    print(x)

func()

gx = 200 #파일에서 태어남, 파일안에서는 다 쓸 수 있다. 전역변수
def func2():
    print(gx)

func2()
print(gx)
gx = gx+300 #오류없음
print(gx)

#
def func3():
    global y #함수안에 선언할 변수를 전역변수로 만들고 싶다.
    #그럴때 스택 공간에 변수를 할당한다
    #계속 살아 있는 변수, 쓸때 신중해야함. 메모리 비효율적으로 사용 
    #예) 장바구니, 로그인 유지, 포인트 계속 보이기 ... etc
    y = 300
    y = y-10
    print(y)

def func3():
    global y
    y = 283

def func4():
    print(y, "~~~")

x = 100
func3()
func4()
print(x)

def func5():
    global x
    x = 200
    print(x, "~")

x = 100
print(x, "~~")
func5()
print(x, "~~~")