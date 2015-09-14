import os
def rename_files():
    os.chdir("/Users/Gineton2/Downloads/prank")
    file_list = os.listdir("/Users/Gineton2/Downloads/prank")
    print("Original file names: ")
    print( file_list)
    
    for file_name in file_list:
        os.rename(file_name, file_name.translate(None, "0123456789"))
        
    print ("New file names: ")
    print(os.listdir("/Users/Gineton2/Downloads/prank"))

        
rename_files()
