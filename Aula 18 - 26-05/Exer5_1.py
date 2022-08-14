vet = []

for i in range(10):
    vet.append(int(input("Entre com o valor vet[%d]: "%i)))

for i in range(9,-1,-1):
    print(vet[i]," ",end = "")
