// Rule 03. Numeric Types and Operations (NUM)
// NUM09-J. Do Not Use Floating-Point Variables as Loop Counters

for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
  System.out.println(x);
}
