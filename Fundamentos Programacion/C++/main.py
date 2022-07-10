f = open("mensaje.txt", "r")
for a in f:
    print(a[::-1])
f.close()