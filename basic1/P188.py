# # 요소 변환 수정(삽입, 삭제, 업데이트)하기
# flowers=["목련", "벚꽃", "장미", "백일홍"]
# print( flowers)
# flowers[1] = "무궁화" #수정
# print(flowers)
# #백일홍 수정하기 개나리
# flowers[-1] = "개나리"
# print(flowers)
# #추가하기 뒤로 붙이기
# flowers.append("백일홍")
# print(flowers)
# flowers.append("튜울립") #리스트.append() 메소드
# print(flowers) #함수
# #메소드 vs 함수 동작시키기
# #메소드는 객체안에서 동작을 시키는 것
# #함수 동작을 시키는 것

# #실무에서는 리스트 어떻게 쓸까? 빈 리스트 만들고 추가로 넣기
# scores = [] # 빈 리스트
# scores.append(100)
# scores.append(90)
# scores.append(85)
# scores.append(100)
# scores.append(98)
# print(scores)

# #특정 위치에 삽입하기
# fruits = []

# while True :
#     fruit = input("좋아하는 과일은?")
#     if fruit =="끝" :
#         break
#     fruits.append(fruit)
# print(fruits)

# number = [5,20,13,7,8,22,7,17]
# print(number)
# idx = number.index(7,5) #5번 인덱스 이후로 나오는 7값찾기
# print(idx)

#삭제하기 remove(요소)
flowers=["목련", "벚꽃", "장미", "벚꽃", "백일홍", "벚꽃"]
flowers.remove("목련")
print(flowers)
flowers.remove("벚꽃")
print(flowers)
#flowers.remove("개나리")#오류발생
x=flowers.pop(2)
print(x)

