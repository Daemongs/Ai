# 온라인 서점의 책 결제금액
price = 20000
discount = 10
delivery = 2000
pay = price - (price*(discount/100)) +delivery
print(f"책값은 {price}, 할인율은 {discount}%, 배송료는 {delivery} 입니다. 따라서 결제금액은 {int(pay)}원입니다")
if delivery>=2000 : 
    print("비싸다")
else : 
    print("저렴하다")
print ("----------------------------------------------------------------------------------------")