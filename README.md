# SampleOneFragment

Note:
Pemanggilan `MainFragment` disini menggunakan fungsi static (companion object) `newInstance`. Jadi, kenapa menggunakan `newInstance`?
- Memudahkan pembuatan fragment & penambahan argument dalam fragment.
- Memudahkan pembacaan kembali argument di dalam fragment, karena code untuk penambahan argument juga berada di dalam class fragment.

Seandainya tidak menggunakan `newInstance` bagaimana? Boleh. Kode pembuatan fragment di dalam fungsi `newInstance` pindahkan ke fungsi `getItem` di dalam class `VPAdapter` (FragmentStateAdapter).
