# #S2-1
# kg = input("변환할 킬로그램(kg)은")
# print("-"*30)
# print("킬로그램     파운드    온스 ")
# print("-"*30)
# pound = int(kg) * 2.204623
# ounce = int(kg) * 35.273962
# # print(f"{kg}    {pound}   {ounce}")
# print("%d       %.2f      %.2f"%(int(kg), pound, ounce ))
# print("-"*30)

#S2-2
phone = input("휴대폰 번호는?")
#Way1) "-" 찾아서 "" 바꾸기
deleteHy = phone.replace("-","")
print(f"입력된 휴대폰 번호 : {phone}")
print(f"하이픈 삭제된 휴대폰 번호 : {deleteHy}")
#Way2) split("-")
deleteHy2 = (phone.split("-"))
print(deleteHy2[0],deleteHy2[1],deleteHy2[2], sep="")