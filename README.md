# Втора лабораториска вежба по Софтверско инженерство
## Снежана Колева 223001

### Control Flow Graph

![SILab2_diagram](https://github.com/kolevas/SI_2024_lab2_223001/assets/138041443/dad31c36-d284-4699-80ce-1b1d48e657d9)


### Цикломатска комплексност
   
   	-Има 9 предикатни јазли, значи комплексноста изнесува 10.

### Тест случаи според критериумот Multiple Condition

за условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')
   
	-TTT -> item.price = 400; item.discount = 0.5; item.barcode = "0777"

	-TTF -> item.price = 400; item.discount = 0.5; item.barcode = "1777"

 	-TFX -> item.price = 400; item.discount = -0.5; item.barcode = any
	
 	-FXX -> item.price = 200; item.discount = any; item.barcode = any

### Тест случаи според критериумот Every Path


![excel](https://github.com/kolevas/SI_2024_lab2_223001/assets/138041443/d3f1c4b7-9fa2-416f-b987-60effd20cd1e)
  
  
### Објаснување на напишаните Unit Tests

- Unit тестовите за секој од case-овите ги пишував според графот, со цел сите гранки да бидат опфатени, како што се бараше. Пред да ги пишувам тест случаите, во excel табела ги запишав сите гранки и со секој тест случај ги боев поминатите гранки за полесна навигација. Почнав од наједноставниот пример (кога се фрла исклучок на почетокот на кодот) и го надградував со различни вредности за да се опфатат сите сегменти од кодот и графот. Кога ги пишував во Gradle, unit тестовите ги гледав од excel табелата која е прикачена тука на репото.

