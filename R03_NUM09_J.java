// Rule 03. Numeric Types and Operations (NUM)
// NUM09-J. Do Not Use Floating-Point Variables as Loop Counters

for (int count = 1; count <= 10; count += 1) {
  float x = count/10.0f;
  System.out.println(x);
}
