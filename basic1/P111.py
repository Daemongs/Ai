"""
start = int (input("시작 수는?"))
end = int(input("끝 수는?"))
num = int(input("정수를 입력하세요: "))

result = "%d은(는) %d~%d사이에 없다." %(num, start, end)

if start <= num <= end :
    result = "%d은(는) %d~%d사이에 있다." %(num, start, end)
    print(result)

"""


import random
# print (random.random()) #0<= r <1
# print (random.randrange(1,7)) #1<=랜덤수<7 (주사위)

#반복문 추가하기 
#틀린횟수 세기
#정답을 맞추면 반복문 종료


thinkNumber = random.randrange(1,31)
c=0
a1 = int(input("답은?")) #15

while a1 != thinkNumber : # 정답을 찾을 때까지
    if a1 < thinkNumber :
        result = "답보다 작은 수입니다"
        c += 1
    else :
        result = "답보다 큰 수입니다."
        c += 1
    print(f"{result}")
    a1 = int(input("답은?"))
result = "정답입니다"
print( f"{c}번만에 찾았습니다")

