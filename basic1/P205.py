

# 결과 홍길동-이순신 최경주
# data = data.replace("/", " ")
# print(data)
# data = data.replace (" ", "-")
# print(data)

#데이터 쪼개기
hello = "Have a nice day; Happy new Year; Merry Christmas"
list1 = hello.split(" ")
print(list1)
list1 = hello.split(";", 1)
print(list1)

names = ["황애린", "홍지수", "안지영"]
print( names )

x = "/".join(names)
print(x)
phoneNumber = ["010", "1234", "5678"]
xx = "-".join(phoneNumber)
print(type(xx))


#209 5-25
phone_list1 = ["010-3654-2637", "010-3984-5377", "010-3554-0973"]
print(phone_list1)

phone_list2 = []
for number in phone_list1 :
    x=number.replace("-","")

    phone_list2.append(x)

print(phone_list2)    
#210 5-26
sentences = ["Love me, love my dog.", "No news is good news.", "Blood is tichker than water."]

for sentence in sentences :
    x = sentence.replace("","_")
    print(x)
#218 5-5
questions = ["s_hool","compu_er", "deco_ation", "windo_", "hi_tory"] 
answers = ["c", "t", "r", "w", "s"] 

for i in range(0, len(questions),1):
    q = "%s : 밑 줄에 들어갈 알파벳은?" %questions[i]
    guess = input(q)

    if guess==answers[i] :
        print("정답!")
    else :
        print("틀렸어요!")

#219 5-6
        
scores = []

while True:
    x = int(input("성적을 입력하세요(종료 시 -1 입력):"))

    if x == -1:
        break
    else:
        scores.append(x)

sum_scores = 0

for score in scores:
    sum_scores += score

avg = sum_scores / len(scores)
print("합계: %d, 평균: %.2f" % (sum_scores, avg))