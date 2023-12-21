# #2차원 리스트
# numbers = [[10,20,30],[40,50,60,],[60,70,80],['a',[100,90]]]
# print ( numbers[0][1])
# print ( numbers[1][2])
# #80
# print ( numbers[2][2])

# #'a'
# print ( numbers)
# #100
# for i in range (0, len(boards)):
#     for j in range(0,len(boards[i])):
#         print (board[i],[j], end=" ")

#     print()

# jumsu = [[10,20], [20,30,40], [60]]

seats = [[ 0,0,0,0,0,0,0,0,0,0],\
         [ 0,0,0,0,0,0,0,0,0,0],\
         [ 0,0,0,0,0,0,0,0,0,0],\
         [ 1,1,1,0,0,0,0,1,0,0],\
         [ 0,0,0,0,0,1,0,0,0,0],\
         [ 0,1,0,0,0,1,0,1,0,0],\
         [ 0,0,0,0,0,0,1,0,0,0],\
         [ 1,0,1,0,0,0,0,0,0,1]]


for i in  range( 0, len( seats )):
    print("%d행"%i, end=" ")
    for j in  range( 0, len( seats[i] )):
        if seats[i][j] == 0:
            print("%3s" % "□", end="")
    print()
row = int(input("좌석예약하기 행을 입력하기"))
colum =  int(input("좌석예약하기 열을 입력하기"))
seats[ row ][colum ] = 1

for i in  range( 0, len( seats )):
    print("%d행"%i, end=" ")
    for j in  range( 0, len( seats[i] )):
        if seats[i][j] == 0:
            print("%3s" % "□", end="")
        else :
            print("%3s" % "■", end="")    
    print()
           