// Rule 04. Characters and Strings (STR)
// STR04-J. Use Compatible Character Encodings when Communicating String Data between JVMs

FileInputStream fis = null;
try {
  fis = new FileInputStream("SomeFile");
  DataInputStream dis = new DataInputStream(fis);
  byte[] data = new byte[1024];
  dis.readFully(data);
  String result = new String(data);
} catch (IOException x) {
  // Handle error
} finally {
  if (fis != null) {
    try {
      fis.close();
    } catch (IOException x) {
      // Forward to handler
    }
  }
}
