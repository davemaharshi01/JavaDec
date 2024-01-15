package Jan14;

import java.util.Scanner;

public class IvrApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Rogers Customer Service");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        System.out.println("Press 3 for Exit");

        Scanner sc = new Scanner(System.in);
        int FirstInput;
        int FinalInput;
        int SecondInput;
        do {
            FirstInput = sc.nextInt();
            switch (FirstInput) {
                case 1:
                    System.out.println("Thank you for choosing the Language, please choose the 1 from the following options:");
                    System.out.println("Press 1 for Mobile");
                    System.out.println("Press 2 for Internet");
                    System.out.println("Press 3 for TV");
                    System.out.println("Press 4 for Exit");

                    do {
                        SecondInput = sc.nextInt();
                        switch (SecondInput) {
                            case 1:
                                System.out.println("Thank you for choosing Mobile");
                                System.out.println("Press 1 for Tech support");
                                System.out.println("Press 2 for Billing");
                                System.out.println("Press 3 for Exit");
                                do {
                                    FinalInput = sc.nextInt();
                                    switch (FinalInput) {
                                        case 1:
                                            System.out.println("Thank you for reaching out to Tech Support");
                                            break;
                                        case 2:
                                            System.out.println("Thank you for reaching out to Billing");
                                            break;
                                        case 3:
                                            System.out.println("Exit and goes back to Main Menu");
                                            break;
                                        default:
                                            System.out.println("Please try again");
                                    }
                                } while (FinalInput != 3);
                                break;
                            case 2:
                                System.out.println("Thank you for choosing Internet");
                                System.out.println("Press 1 for Tech support");
                                System.out.println("Press 2 for Billing");
                                System.out.println("Press 3 for Exit");
                                do {
                                    FinalInput = sc.nextInt();
                                    switch (FinalInput) {
                                        case 1:
                                            System.out.println("Thank you for reaching out to Tech Support");
                                            break;
                                        case 2:
                                            System.out.println("Thank you for reaching out to Billing");
                                            break;
                                        case 3:
                                            System.out.println("Exit and goes back to Main Menu");
                                            break;
                                        default:
                                            System.out.println("Please try again");
                                    }
                                } while (FinalInput != 3);
                                break;
                            case 3:
                                System.out.println("Thank you for choosing TV");
                                System.out.println("Press 1 for Tech support");
                                System.out.println("Press 2 for Billing");
                                System.out.println("Press 3 for Exit");
                                do {
                                    FinalInput = sc.nextInt();
                                    switch (FinalInput) {
                                        case 1:
                                            System.out.println("Thank you for reaching out to Tech Support");
                                            break;
                                        case 2:
                                            System.out.println("Thank you for reaching out to Billing");
                                            break;
                                        case 3:
                                            System.out.println("Exit and goes back to Main Menu");
                                            break;
                                        default:
                                            System.out.println("Please try again");
                                    }
                                } while (FinalInput != 3);

                                break;
                            case 4:
                                System.out.println("Thank you for using Rogers IVR System GoodBye");
                                break;
                            default:
                                System.out.println("Please Try again");
                        }
                    } while (SecondInput != 4);
                break;
                case 2:
                    System.out.println("Thank you for choosing the French as a language");
                break;
                case 3:
                    System.out.println("Thank you for using Rogers IVR System");
                break;
                default:
                    System.out.println("Please try again");
            }
            } while (FirstInput != 3);
        return;
        }
    }


//if (SecondInput == 1) {
//                            System.out.println("Please select the options from the following:");
//                            do {
//                                FinalInput = sc.nextInt();
//                            if (FinalInput == 1) {
//                                System.out.println("Thank you for reaching the tech support in Mobile How may I help you?");
//                            } else if (FinalInput == 2) {
//                                System.out.println("Thank you for reaching out to Mobile Billing");
//                            }
//                                System.out.println("Please try again");
//                            }while (FinalInput != 3);
//                        } else if (SecondInput == 2) {
//                            System.out.println("Please select from the following:");
//                            do {
//                                FinalInput = sc.nextInt();
//                                if (FinalInput == 1) {
//                                    System.out.println("Thank you for reaching out to Tech support");
//                                } else if (FinalInput == 2) {
//                                    System.out.println("Thank you for reaching out to Billing");
//                                }
//                                System.out.println("Please try again");
//                            } while (FinalInput != 3);
//                        } else if (SecondInput == 3) {
//                            System.out.println("Please select from the following");
//                            do {
//                                FinalInput = sc.nextInt();
//                                if (FinalInput == 1) {
//                                    System.out.println("Thank you for reaching out to Tech support");
//                                } else if (FinalInput == 2) {
//                                    System.out.println("Thank you for reaching out to Billing");
//                                }
//                                else {
//                                    System.out.println("Please try again");
//                                }
//                            } while (FinalInput != 3);