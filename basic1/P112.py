month = input("월을 숫자로 입력하세요: ")

if month =="3" or month == "4" or month == "5" :
    print("%s월은 봄입니다." %month)

if month =="6" or month == "7" or month == "8" :
    print("%s월은 여름입니다." %month)

if month =="9" or month == "10" or month == "11" :
    print("%s월은 가을입니다." %month)

if month =="12" or month == "1" or month == "2" :
    print("%s월은 겨울입니다." %month) 

print("----------------------"*3)

a = input("주민번호 뒷자리 첫번째 숫자를 입력해 주세요: ")
if a =="1" or a == "3" :
    print("남성입니다!")

if a =="2" or a == "4" :
    print("여성입니다!")