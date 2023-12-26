def cir_area():
    global r
    result = r * r * 3.14
    return result

def cir_length():
    global r
    result = 2*3.14*r
    return result

r = 10
area = cir_area()
length = cir_length()

print(f"원의 면적: {area:.1f}, 원주의 길이: {length:.1f}")
print("원의 면적: %.1f, 원주의 길이: %.1f"%(area,length))

#######################################

a = 10
print(a)

def f() :
    global x
    x = 100
    print(x)

f()
x = 25 #전역변수