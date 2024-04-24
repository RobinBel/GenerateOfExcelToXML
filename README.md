# GenrateOfExcelToXml

Este proyecto sirve para la construccion de un xml a partir de un excel.

Esta configurado con una plantilla Excel para generar los productos en formato xml para estar listos para carga por conector a LX.

## Uso del JAR 
El convert-product-xml.zip esta listo para descarga y uso.
Este JAR sirve para construccion de un xml para subir los productos a crear por conector a LX. 

Para utilizar este Jar debe seguir los siguientes pasos:

1- Editar el excel llamado "plantilla" donde se almacena los datos de los productos. Cuidado con eliminar las cabeceras del excel, solo edite las filas de informacion.

2- Abrir una consola cmd y colocar la direccion donde se encuentra jar "GenerateOfExcelToXML". Recuerde que tienen que estar en las misma carpeta el Jar y el excel.

	cd "ubicacion-del-jar"
 
3- Ejecute el siguiente comando para construir el xml a partir del excel:

	java -jar GenerateOfExcelToXML.jar
 
4- verificar si en la carpeta se creo un archivo xml
