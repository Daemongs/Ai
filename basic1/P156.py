#152

print("-" *30)
print("섭씨 화씨")
print("-" *30)

for c in range(-20, 31, 5):
    f = c*9.0/5.0+32.0
    print("%5d %6.1f"%(c,f))

print("-"*30)

count = 0

for i in range(200, 800, 5):
    if i % 5 == 0:
        print("%d" % i, end=" ")
        count = count + 1

        if i % 10 == 0:
            print()