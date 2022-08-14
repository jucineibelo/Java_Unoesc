vet = []

for i in range(10):
    vet.append(int(input("Entre com o valor vet1[%d]: "%i)))

ima = 0
ime = 0
for i in range(10):
    if vet[i] > vet[ima]:
        ima = i
    if vet[i] < vet[ime]:
        ime = i
    
print("O menor valor é",vet[ime],"e está no indice",ime)
print("O maior valor é",vet[ima],"e está no indice",ima)