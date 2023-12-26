#딕셔너리 생성
inventory = {"메로나":[300,20],
             "비비빅":[400,3],
             "죠스바":[250,100]}

# for i in inventory:
#     t = inventory[i][0] * inventory[i][1]
#     print(f"{i} {inventory[i][0]}원 {inventory[i][1]}개 {t}원")

#메로나 가격?
print (inventory ["메로나"][0],"원", sep="")
#죠스바의 재고는 ? 100개
print (inventory ["죠스바"][1], "개", sep="")
#월드콘 추가 1500,50
inventory["월드콘"] = [1500,50]
print (inventory)
#죠스바 350원으로 변동
inventory["죠스바"] =[350,100]
print(inventory)
#아이스크림 품목수는?
print(len(inventory), "종류")
#아이스크림 종류는? key
for key in inventory:
    print(key, "종류")

scores={"김채린":85, "박수정":98, "함소희":94, "안예린":90, "연수진":93}
sum = 0
for key in scores:
    sum = sum+scores[key]
    print("%s : %d" % (key, scores[key]))
avg = sum/len(scores)
print("합계:%d, 평균:%.2f"%(sum, avg))

admin_info={"id":"admin", "password":"12345"}
input_id=input("아이디를 입력하세요:")
input_pass=input("비밀번호를 입력하세요:")
if input_id==admin_info["id"]  and input_pass==admin_info["password"]:
    print("정보에 접근 권한이 있습니다!")
else :
    print("정보에 접근 권한이 없습니다!")

words={"꽃":"flower", "나비":"butterfly", "학교":"school", "자동차":"car","비행기":"airplane"}
print("<영어 단어 맞추기 퀴즈>")
for kor in words :
    input_word=input("'%s'에 해당되는 영어 단어를 입력해주세요: "% kor)
    if  input_word == words[kor] :
        print("정답입니다!")
    else :
        print("틀렸습니다!")

