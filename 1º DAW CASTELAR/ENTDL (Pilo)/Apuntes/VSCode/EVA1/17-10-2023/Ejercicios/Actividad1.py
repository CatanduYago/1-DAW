# Un trabajador cobra brutos 2800€. Retenciones por IRPF 16 si es interino o 21 si es funcionario de carrera. Por cada trienio cobra bruto 54€ y se le aplica a misma retencion IRPF. 
# Por el primer sesenio cobra 54€, por el segundo 86€ y por el tercero 125€. 
# Si tiene familia numerosa, se le reduce en un punto el IRPF. 
# Queremos un programa que se ejecute hasta que se pulse la F de fin. 
# Hasta entonces tiene que preguntar los datos oportunos e 
# imprimir un informe con el nombre, funcionario o interino,trienios y sesnios, familila numerosas (si/No) y sueldo neto.
def calcular_sueldo_neto(tipo_empleado, trienios, sesenios, familia_numerosa):
    salario_base = 2800
    retencion_irpf = 21 if tipo_empleado == 'F' else 16

    sueldo_neto = salario_base - (retencion_irpf / 100) * salario_base
    sueldo_neto += trienios * 54

    if sesenios == 1:
        sueldo_neto += 54
    elif sesenios == 2:
        sueldo_neto += 86
    elif sesenios == 3:
        sueldo_neto += 125

    if familia_numerosa == 'SÍ':
        retencion_irpf -= 1
        sueldo_neto = salario_base - (retencion_irpf / 100) * salario_base

    return sueldo_neto

while True:
    nombre = input("Introduzca el nombre del trabajador o ""F""para salir: ")
    if nombre.upper() == "F":
        break
    tipo_empleado = input("¿Es funcionario de carrera (F) o interino (I)? ").upper()
    trienios = int(input("Número de trienios del trabajador: "))
    sesenios = int(input("Número de sesenios del trabajador: "))
    familia_numerosa = input("¿Tiene familia numerosa (Sí/No)? ").upper()

    sueldo_neto = calcular_sueldo_neto(tipo_empleado, trienios, sesenios, familia_numerosa)

    print("\n\nInforme del trabajador:")
    print("Nombre:", nombre)
    print("Tipo de empleado:", "Funcionario de carrera" if tipo_empleado == 'F' else "Interino")
    print("Trienios:", trienios)
    print("Sesenios:", sesenios)
    print("Familia numerosa:", familia_numerosa)
    print("Sueldo neto:", sueldo_neto, "€")

    continuar = input("\n¿Desea calcular el sueldo neto para otro trabajador? (S para continuar, F para finalizar): ").upper()
    if continuar == 'F':
        break


    
    
    