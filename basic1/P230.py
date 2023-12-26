# 튜플 - 수정이 안된다. 용도 - 변동 불가한 것
t = (1,2)
t1 = 1,2
print (t[0])
print (t1[1])
print (type (t1))
t2 = (1,)
print (type (t2)) #()생략할 수 있다, 1개 요소 (1,)
t3 = () #빈 튜플
print (type (t3))

animals = ("토끼", "거북이", "사자" ,"여우")
print( animals [1:3 ])
ani_list = list(animals)
print (type(ani_list))
print (ani_list)
ani_list[0] = "돼지"
print( ani_list)
animals = tuple(ani_list)
print (animals)

#튜플 만들기
#변수 = (), 변수 = tuple=( () )
n = tuple(range (10,21))
print(n)
n2 = tuple([1,2,3])
print(n2)

t1 = ('valentine',2,14,'gift')
print(t1[1:2]) # tuple형의 slice 사용 답 (2,)

t2 = ('love',)
print(t2[0])  # 출력 'love' 하나의 원소만 출력된다

t2[0:]  #  출력 ('love',)  0번 자리의 원소부터 끝까지 slice기능으로 출력된다.
print(t1+t2) 
print(t2*2)
print(len(t1))

a_1 = ["홍길동","이수지","박상민"]
a_1[1] = "하누리"
print( a_1)

# a_2 = ("홍길동","이수지","박상민")
# a_2[1] = "하누리"
# print( a_2)

