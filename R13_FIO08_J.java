FileInputStream in = new FileInputStream("file");
int data;
while ((data = in.read()) != -1) {
    // Process data
}
in.close();
