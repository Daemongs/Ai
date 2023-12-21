# 병합, 합계, 순서꺼꾸로, 정렬, 복사
person1 = ["kim", 24, "kim@naver.com"]
person2 = ["lee", 35, "lee@hanmail.net"]

person = person1 + person2
print(person)

jumsu = list (range (90, 101,1))
avg = sum (jumsu) / len(jumsu)
print(avg)

data = ["사과", "배", "귤", "딸기"]
data.reverse()
print(data)


#복사하기
fruits = ["apple", "banana", "ornage"]
print(fruits)

x=fruits.copy()
print(x)
print(type(x))

xx = fruits
print(xx)
print(type(xx))