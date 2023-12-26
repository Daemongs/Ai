#E6-1
year_sale ={"2016":237, "2017":98, "2018":158,"2019":233, "2020":120}
for key in year_sale:
    if key == "2017" :
        print("%s년 자동차 판매량 : %d대" % (key,year_sale[key]))

#E6-2
year_sale ={"2016":237, "2017":98, "2018":158,"2019":233, "2020":120}
sm=0
for key in year_sale:
    if key == "2018" or key == "2019" :
        print("%s년 자동차 판매량 : %d대" % (key, year_sale[key] ))
        sm = sm + year_sale[key]

print("2년간 자동차 판매량: %d대"% sm)

#E6-3
year_sale ={"2016":237, "2017":98, "2018":158,"2019":233, "2020":120}
sm=0
for key in year_sale:
    sm = sm+year_sale[key]

avg = sm/len(year_sale)

print("5년간 총 판매량: %d대"% sm)
print("5년간 연 평균 판매량 : %d" % avg)

#E6-4
year_sale ={"2016":237, "2017":98, "2018":158,"2019":233, "2020":120}

big_year = 2016
biggest = year_sale["2016"]
for key in year_sale :
    if year_sale[key] > biggest :
        big_year = key
        biggest = year_sale[key]

print("판매량이 가장 많은 해 :%s년" %big_year)
print("판매량: %d대" % biggest)