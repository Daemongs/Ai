yn = "y"
while yn == "y" :
    print("기능 선택")
    print("1. 더하기")
    print("2. 빼기")
    print("3. 곱하기")
    print("4. 나누기:")
    print()

    s = input("계산기 기능을 선택하세요(1/2/3/4): ")

    num1 = int(input("첫 번째 숫자를 입력하세요: "))
    num2 = int(input("두 번째 숫자를 입력하세요: "))
    num3 = int(input("세 번째 숫자를 입력하세요: "))

    if s == "1": # 더하기
        print("*%d + %d + %d = %d" % (num1, num2, num3, num1 + num2 + num3),)
    elif s == "2" : #빼기
        print("*%d - %d - %d =%d" % (num1, num2, num3, num1 - num2 - num3))
    elif s == "3": # 곱하기
        print("%d * %d * %d = %d" % (num1, num2, num3, num1 * num2 * num3))
    elif s == "4": # 나누기
        print("%d / %d = %d" % (num1, num2, num1 / num2 ))
    else:
        print("입력 숫자가 잘못되었습니다!")
        
    yn = input("계속하시겠습니까? y/n")
print ("수고하셨습니다.")