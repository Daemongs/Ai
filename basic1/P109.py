"""
ans1 = input("'사자'의 영어 단어는 무엇일까요?:") # 질문에 대한 답 입력
result = "땡! 틀렸습니다." #초기화
if ans1 =="lion" : #정답체크
    result = "딩동댕! 참 잘했습니다~~~"
print(result)


ans2 = input("'오렌지'의 영어 단어는 무엇일까요?:") # 질문에 대한 답 입력
result = "땡! 틀렸습니다."
if ans2 =="Orange" : #정답체크
    result = "딩동댕! 참 잘했습니다~~~"
print(result)

ans3 = input("'기차'의 영어 단어는 무엇일까요?:") # 질문에 대한 답 입력
result = "땡! 틀렸습니다."
if ans3 =="train" : #정답체크
    result = "딩동댕! 참 잘했습니다~~~"
print(result)
"""

print("영어단어 공부하기 ver 2.0")

totalQuiz = 0
correctAns = 0

yn= "y"
while yn == "y"   :

    q1=input("질문단어는(한국어)?")
    a1=input("답변단어(영어)?")

    totalQuiz += 1

    if q1 =='사자'and a1 =='lion' :
        result = "딩동댕! 참 잘했어요~~~"
        correctAns += 1
    elif q1 == '오렌지' and a1 == 'orange' :
        result = "딩동댕! 참 잘했어요~~~"
        correctAns += 1
    
    elif q1 == '기차' and a1 == 'train' :
        result = "딩동댕! 참 잘했어요~~~"
        correctAns += 1

    else :
        result = "땡 틀렸습니다.ㅠㅠ"
    print (result)     
    yn = input("계속 공부할래요? (y/n)")

    print(f"\n총 문제 수: {totalQuiz}개")
    print(f"맞춘 문제 수: {correctAns}개")
    print(f"틀린 문제 수 : {totalQuiz-correctAns}개")
