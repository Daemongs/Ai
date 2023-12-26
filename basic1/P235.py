#set형
color_list = {'red', 'blue', 'red', 'green'}
print(color_list)
# print(color_list[0]) #인덱스 번호가 없다, 집합이다
p = {1,2,'red','blue'}
plus = color_list & p #교집합
print(plus)
plus = color_list | p #합집합
print(plus)
plus = color_list - p #여집합
print(plus)

b={10,11}
b.add(20)
print (b)
b.update({5})
print(b)
b.remove(10)
print(b)
