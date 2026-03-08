FileInputStream in = new FileInputStream("file");
byte data;
while ((data = (byte) in.read()) != -1) {
    // Process data
}
in.close();
