# 소수만 출력하기

start = int( input("시작 수를 입력해주세요:") )   
end = int(input("끝 수를 입력해주세요 :"))    
x=True #소수인 경우는 True로 아닌 경우 False로    
for i in range( start, end+1) : # start 30 end 80
    x = True
    for j in range( 2, i) : # 2~29까지 나누어 본다
        if i % j == 0 :
            x = False
            break # 한단계 반복문 밖으로 나간다. 즉 for j에서 밖으로 
    if x :
        print( i, end=" ")
        