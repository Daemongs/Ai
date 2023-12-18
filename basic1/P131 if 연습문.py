# 1. 파이썬에서 True혹은 False를 갖는 타입은?
# Boolean


# 2. 아래 코드 출력 결과는?

print( 8 == 5)



# 3. 아래코드 출력 결과는?

print( 3 < 5)


# 4. 아래 코드 출력 결과는?

print( ( 3 == 3) and (4 !=3))


# 5. 아래 코드가 에러가 발생하는 이유는?

print( 3 >= 4)

# 6. 아래 코드 실행 결과는?

if 4 > 3:
    print("Hello") #틀리면 진행이 안된다

# 7. 아래 코드의 출력 결과를 예상하라

if 4 < 3:
    print("Hello World.")
else:
    print("Hi, there.")


# 8. 아래 코드의 출력 결과를 예상하라

if True : #? 왜 사실이지? 뭐 안물어 봤는데
    print ("1")
    print ("2")

else :

    print("3")
    print("4")

# 9. 아래 코드의 출력 결과를 예상하라

if True :
    if False:
        print("1")
        print("2")

    else:
        print("3")

else :
    print("4")

print("5")

# 10 사용자로부터 입력받은 문자열을 두 번 출력하라. 아래는 사용자가 "안녕하세요"를 입력한 경우의 출력 결과이다.
# >>입력하기  안녕하세요

print ("​안녕하세요 "*2)

# 11 사용자로부터 하나의 숫자를 입력받고, 입력 받은 숫자에 10을 더해 출력하라.

num1 = input("숫자를 입력하세요: ")
ans1 = float(num1)+10
print("입력한 숫자에 10을 더한 값은 :", ans1)

