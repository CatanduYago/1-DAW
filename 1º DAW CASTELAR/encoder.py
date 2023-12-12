from cryptography.hazmat.backends import default_backend
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes

def aes_256_decrypt(ciphertext, key, iv):
    backend = default_backend()
    cipher = Cipher(algorithms.AES(key), modes.CFB(iv), backend=backend)
    decryptor = cipher.decryptor()
    plaintext = decryptor.update(ciphertext) + decryptor.finalize()
    return plaintext

ciphertext = bytes.fromhex("9ce44f88a25272b6d9cbb430ebbcfcf1")
key = b'your_AES_key_32_bytes'
iv = b'your_initialization_vector_16_bytes'

decrypted_data = aes_256_decrypt(ciphertext, key, iv)
print(decrypted_data.decode('utf-8'))
