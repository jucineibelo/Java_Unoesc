vet = []

for i in range(10):
    vet.append(int(input("Entre com o valor vet1[%d]: "%i)))

print("Vetor original")
print(vet)

for i in range(10):
    vet[i] = vet[i] * 5

print("Vetor original multiplicando por 5")
print(vet)

