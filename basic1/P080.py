# P.081
# kor = input("국어 성적을 입력하세요: ")
# eng = input("영어 성적을 입력하세요: ")
# math = input("수학 성적을 입력하세요: ")
# sum = int(kor)+int(eng)+int(math)
# avg = sum/3

# print("합계: %d, 평균:%.2f" %(sum,avg))

# P.081
# price = 3000
# num = 3
# pay = 10000

# change = pay-price*num
# print('거스름 돈--> %d원' %change)
# print(f"거스름 돈 --> {change}원")

# P.083 탄생년을 입력받아 나이계산하기
# name=input("당신의 이름은?")
# birth = int(input("당신이 태어난 년도는?"))

# age = 2023-birth
# print("%s님의 나이는 %d세 입니다" %(name,age))
# print(f"{name}님의 나이는 {birth}세 입니다")

# # 자동변환 년도
# from datetime import datetime
# # 현재 날짜와 시간을 가져옵니다.
# current_datetime = datetime.now()
# print (datetime.today())
# # 년도를 가져옵니다.
# current_year = current_datetime.year

# # 결과 출력
# print("현재 년도:", current_year)
# name=input("당신의 이름은?")
# birth = int(input("당신이 태어난 년도는?"))
# age = current_datetime.year-birth
# print(f"{name}님의 나이는 {birth}세 입니다")

# 확장하기
# 오늘 요일 구하기 - 숫자로 구해짐
# 월요일 0 화요일 1... 일요일은 6이 됨
# 출력하면 3 수요일이 나오게 하기
from datetime import datetime

# P.086
# # 현재 날짜와 시간을 가져옵니다.
# current_datetime = datetime.now()
# # 요일을 가져옵니다. (0: 월요일, 1: 화요일, ..., 6: 일요일)
# current_weekday = current_datetime.weekday()
# # 숫자를 실제 요일 문자열로 변환
# weekday_names = ["월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"]
# current_weekday_name = weekday_names[current_weekday]
# # 결과 출력
# year = datetime.today().year
# month = datetime.today().month
# day = datetime.today().day
# weekday = datetime.today().weekday()
# print(year,month,day,weekday,sep=".")
# print("오늘은 {} 입니다.".format(current_weekday_name))

#P.087
# width = 10
# height = 20
width = int(input("사각형의 너비는?"))
height=int(input("사각형의 높이는?"))
length = width *2 + height *2 #사각형 둘레
area =  width*height #사각형 넓이
print (f"사각형의 둘레는 {length}")
print (f"사각형의 넓이는 {area}")
print ("-----------------------------")
if area >= 100 : 
    print ("큰 사각형이네요"), 
else : print("작은 사각형이네요")    

if 100 <= area <= 300 :
    print("큰사각형")
elif 50 <= area <=99 : 
    print("중간사각형") 
else :
    print("작은사각형")